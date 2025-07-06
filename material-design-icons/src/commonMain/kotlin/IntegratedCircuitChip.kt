package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.IntegratedCircuitChip: ImageVector
    get() {
        if (_IntegratedCircuitChip != null) {
            return _IntegratedCircuitChip!!
        }
        _IntegratedCircuitChip = ImageVector.Builder(
            name = "IntegratedCircuitChip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                horizontalLineTo(20f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(18.59f)
                lineTo(16f, 10.59f)
                verticalLineTo(14.59f)
                lineTo(14f, 16.59f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(16.59f)
                lineTo(8f, 14.59f)
                verticalLineTo(9.41f)
                lineTo(10f, 7.41f)
                verticalLineTo(4f)
                moveTo(18f, 11.41f)
                verticalLineTo(14f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(19.41f)
                lineTo(18f, 11.41f)
                moveTo(6.59f, 8f)
                lineTo(8f, 6.59f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(6.59f)
                moveTo(6f, 14f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                moveTo(8f, 17.41f)
                lineTo(6.59f, 16f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.89f, 20f, 4f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(17.41f)
                moveTo(17.41f, 16f)
                lineTo(16f, 17.41f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                curveTo(21.11f, 20f, 22f, 19.11f, 22f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(17.41f)
                close()
            }
        }.build()

        return _IntegratedCircuitChip!!
    }

@Suppress("ObjectPropertyName")
private var _IntegratedCircuitChip: ImageVector? = null
