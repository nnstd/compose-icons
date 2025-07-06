package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScrewMachineRoundTop: ImageVector
    get() {
        if (_ScrewMachineRoundTop != null) {
            return _ScrewMachineRoundTop!!
        }
        _ScrewMachineRoundTop = ImageVector.Builder(
            name = "ScrewMachineRoundTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 7.3f)
                lineTo(13.5f, 8f)
                verticalLineTo(7f)
                horizontalLineTo(10.5f)
                verticalLineTo(10f)
                lineTo(9.5f, 10.7f)
                verticalLineTo(11.7f)
                lineTo(14.5f, 8.4f)
                verticalLineTo(7.3f)
                moveTo(14.5f, 11.3f)
                lineTo(13.5f, 12f)
                verticalLineTo(10f)
                lineTo(10.5f, 12f)
                verticalLineTo(14f)
                lineTo(9.5f, 14.7f)
                verticalLineTo(15.7f)
                lineTo(14.5f, 12.4f)
                verticalLineTo(11.3f)
                moveTo(14.5f, 15.3f)
                lineTo(13.5f, 16f)
                verticalLineTo(14f)
                lineTo(10.5f, 16f)
                verticalLineTo(18f)
                lineTo(9.5f, 18.7f)
                verticalLineTo(19.7f)
                lineTo(14.5f, 16.4f)
                verticalLineTo(15.3f)
                moveTo(7f, 6f)
                horizontalLineTo(17f)
                curveTo(17f, 6f, 16f, 3f, 12f, 3f)
                curveTo(8f, 3f, 7f, 6f, 7f, 6f)
                moveTo(13.5f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(10.5f)
                verticalLineTo(20f)
                lineTo(13.5f, 18f)
                close()
            }
        }.build()

        return _ScrewMachineRoundTop!!
    }

@Suppress("ObjectPropertyName")
private var _ScrewMachineRoundTop: ImageVector? = null
