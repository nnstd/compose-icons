package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrayRemove: ImageVector
    get() {
        if (_TrayRemove != null) {
            return _TrayRemove!!
        }
        _TrayRemove = ImageVector.Builder(
            name = "TrayRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                moveTo(14.12f, 5.46f)
                lineTo(15.54f, 6.88f)
                lineTo(13.41f, 9f)
                lineTo(15.54f, 11.12f)
                lineTo(14.12f, 12.54f)
                lineTo(12f, 10.41f)
                lineTo(9.88f, 12.54f)
                lineTo(8.46f, 11.12f)
                lineTo(10.59f, 9f)
                lineTo(8.46f, 6.88f)
                lineTo(9.88f, 5.46f)
                lineTo(12f, 7.59f)
                close()
            }
        }.build()

        return _TrayRemove!!
    }

@Suppress("ObjectPropertyName")
private var _TrayRemove: ImageVector? = null
