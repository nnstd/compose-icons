package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SlotMachineOutline: ImageVector
    get() {
        if (_SlotMachineOutline != null) {
            return _SlotMachineOutline!!
        }
        _SlotMachineOutline = ImageVector.Builder(
            name = "SlotMachineOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 12f)
                lineTo(7f, 8f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                lineTo(4f, 12f)
                moveTo(9f, 12f)
                lineTo(11f, 8f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                lineTo(8f, 12f)
                moveTo(13f, 12f)
                lineTo(15f, 8f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                lineTo(12f, 12f)
                moveTo(21f, 2f)
                curveTo(19.9f, 2f, 19f, 2.9f, 19f, 4f)
                curveTo(19f, 4.7f, 19.4f, 5.4f, 20f, 5.7f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                curveTo(17.6f, 15f, 18f, 14.6f, 18f, 14f)
                verticalLineTo(5f)
                curveTo(18f, 4.4f, 17.6f, 4f, 17f, 4f)
                horizontalLineTo(13.2f)
                curveTo(12.4f, 2.8f, 11f, 2f, 9.5f, 2f)
                reflectiveCurveTo(6.6f, 2.8f, 5.8f, 4f)
                horizontalLineTo(2f)
                curveTo(1.4f, 4f, 1f, 4.4f, 1f, 5f)
                verticalLineTo(14f)
                curveTo(1f, 14.6f, 1.4f, 15f, 2f, 15f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                curveTo(21.1f, 19f, 22f, 18.1f, 22f, 17f)
                verticalLineTo(5.7f)
                curveTo(22.6f, 5.4f, 23f, 4.7f, 23f, 4f)
                curveTo(23f, 2.9f, 22.1f, 2f, 21f, 2f)
                moveTo(3f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(15f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                moveTo(13f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _SlotMachineOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SlotMachineOutline: ImageVector? = null
