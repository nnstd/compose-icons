package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrayArrowDown: ImageVector
    get() {
        if (_TrayArrowDown != null) {
            return _TrayArrowDown!!
        }
        _TrayArrowDown = ImageVector.Builder(
            name = "TrayArrowDown",
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
                moveTo(12f, 15f)
                lineTo(17.55f, 9.54f)
                lineTo(16.13f, 8.13f)
                lineTo(13f, 11.25f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
                verticalLineTo(11.25f)
                lineTo(7.88f, 8.13f)
                lineTo(6.46f, 9.55f)
                lineTo(12f, 15f)
                close()
            }
        }.build()

        return _TrayArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _TrayArrowDown: ImageVector? = null
