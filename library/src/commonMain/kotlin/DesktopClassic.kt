package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DesktopClassic: ImageVector
    get() {
        if (_DesktopClassic != null) {
            return _DesktopClassic!!
        }
        _DesktopClassic = ImageVector.Builder(
            name = "DesktopClassic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(12f)
                curveTo(4f, 13.11f, 4.89f, 14f, 6f, 14f)
                horizontalLineTo(18f)
                curveTo(19.11f, 14f, 20f, 13.11f, 20f, 12f)
                verticalLineTo(4f)
                curveTo(20f, 2.89f, 19.11f, 2f, 18f, 2f)
                horizontalLineTo(6f)
                moveTo(6f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                moveTo(4f, 15f)
                curveTo(2.89f, 15f, 2f, 15.89f, 2f, 17f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.89f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(17f)
                curveTo(22f, 15.89f, 21.11f, 15f, 20f, 15f)
                horizontalLineTo(4f)
                moveTo(8f, 17f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                moveTo(9f, 17.75f)
                verticalLineTo(19.25f)
                horizontalLineTo(13f)
                verticalLineTo(17.75f)
                horizontalLineTo(9f)
                moveTo(15f, 17.75f)
                verticalLineTo(19.25f)
                horizontalLineTo(19f)
                verticalLineTo(17.75f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _DesktopClassic!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopClassic: ImageVector? = null
