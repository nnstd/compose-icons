package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Peace: ImageVector
    get() {
        if (_Peace != null) {
            return _Peace!!
        }
        _Peace = ImageVector.Builder(
            name = "Peace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(11f, 14.41f)
                verticalLineTo(19.93f)
                curveTo(9.58f, 19.75f, 8.23f, 19.19f, 7.1f, 18.31f)
                lineTo(11f, 14.41f)
                moveTo(13f, 14.41f)
                lineTo(16.9f, 18.31f)
                curveTo(15.77f, 19.19f, 14.42f, 19.75f, 13f, 19.93f)
                verticalLineTo(14.41f)
                moveTo(4f, 12f)
                curveTo(4f, 7.97f, 7f, 4.57f, 11f, 4.07f)
                verticalLineTo(11.59f)
                lineTo(5.69f, 16.9f)
                curveTo(4.59f, 15.5f, 4f, 13.78f, 4f, 12f)
                moveTo(18.31f, 16.9f)
                lineTo(13f, 11.59f)
                verticalLineTo(4.07f)
                curveTo(17f, 4.57f, 20f, 7.97f, 20f, 12f)
                curveTo(20f, 13.78f, 19.41f, 15.5f, 18.31f, 16.9f)
                close()
            }
        }.build()

        return _Peace!!
    }

@Suppress("ObjectPropertyName")
private var _Peace: ImageVector? = null
