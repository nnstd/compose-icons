package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorArrowDownVariant: ImageVector
    get() {
        if (_MonitorArrowDownVariant != null) {
            return _MonitorArrowDownVariant!!
        }
        _MonitorArrowDownVariant = ImageVector.Builder(
            name = "MonitorArrowDownVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14f)
                lineTo(22f, 9f)
                lineTo(20.6f, 7.6f)
                lineTo(18f, 10.2f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(10.2f)
                lineTo(13.4f, 7.6f)
                lineTo(12f, 9f)
                lineTo(17f, 14f)
                moveTo(23f, 14f)
                verticalLineTo(16f)
                curveTo(23f, 17.1f, 22.1f, 18f, 21f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                curveTo(1.9f, 18f, 1f, 17.1f, 1f, 16f)
                verticalLineTo(4f)
                curveTo(1f, 2.9f, 1.9f, 2f, 3f, 2f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _MonitorArrowDownVariant!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorArrowDownVariant: ImageVector? = null
