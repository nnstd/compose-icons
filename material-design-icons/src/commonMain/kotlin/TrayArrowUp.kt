package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrayArrowUp: ImageVector
    get() {
        if (_TrayArrowUp != null) {
            return _TrayArrowUp!!
        }
        _TrayArrowUp = ImageVector.Builder(
            name = "TrayArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                curveTo(22f, 18.11f, 21.11f, 19f, 20f, 19f)
                horizontalLineTo(4f)
                curveTo(2.9f, 19f, 2f, 18.11f, 2f, 17f)
                verticalLineTo(12f)
                moveTo(12f, 2f)
                lineTo(6.46f, 7.46f)
                lineTo(7.88f, 8.88f)
                lineTo(11f, 5.75f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(5.75f)
                lineTo(16.13f, 8.88f)
                lineTo(17.55f, 7.45f)
                lineTo(12f, 2f)
                close()
            }
        }.build()

        return _TrayArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _TrayArrowUp: ImageVector? = null
