package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountOffOutline: ImageVector
    get() {
        if (_AccountOffOutline != null) {
            return _AccountOffOutline!!
        }
        _AccountOffOutline = ImageVector.Builder(
            name = "AccountOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.75f, 7f)
                lineTo(4.03f, 5.75f)
                lineTo(13.26f, 15f)
                lineTo(20f, 21.72f)
                lineTo(18.73f, 23f)
                lineTo(15.73f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                curveTo(4f, 15.14f, 6.61f, 13.92f, 9.09f, 13.36f)
                lineTo(2.75f, 7f)
                moveTo(20f, 17f)
                verticalLineTo(19.18f)
                lineTo(18.1f, 17.28f)
                verticalLineTo(17f)
                curveTo(18.1f, 16.74f, 17.6f, 16.35f, 16.8f, 16f)
                lineTo(14f, 13.18f)
                curveTo(16.71f, 13.63f, 20f, 14.91f, 20f, 17f)
                moveTo(5.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(13.83f)
                lineTo(10.72f, 15f)
                curveTo(8.19f, 15.3f, 5.9f, 16.45f, 5.9f, 17f)
                moveTo(12f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 8f)
                curveTo(16f, 9.95f, 14.6f, 11.58f, 12.75f, 11.93f)
                lineTo(8.07f, 7.25f)
                curveTo(8.42f, 5.4f, 10.05f, 4f, 12f, 4f)
                moveTo(12f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                close()
            }
        }.build()

        return _AccountOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountOffOutline: ImageVector? = null
