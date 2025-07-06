package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MidiPort: ImageVector
    get() {
        if (_MidiPort != null) {
            return _MidiPort!!
        }
        _MidiPort = ImageVector.Builder(
            name = "MidiPort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(20.18f, 12f)
                curveTo(20.18f, 8.18f, 17.55f, 4.96f, 14f, 4.07f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(4.07f)
                curveTo(6.45f, 4.96f, 3.82f, 8.18f, 3.82f, 12f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20.18f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.18f, 12f)
                moveTo(7f, 10.64f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.36f, 12f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 13.36f)
                curveTo(6.25f, 13.36f, 5.64f, 12.75f, 5.64f, 12f)
                curveTo(5.64f, 11.25f, 6.25f, 10.64f, 7f, 10.64f)
                moveTo(17f, 10.64f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.36f, 12f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 13.36f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.64f, 12f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 10.64f)
                moveTo(8.36f, 14.27f)
                arcTo(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.73f, 15.64f)
                curveTo(9.73f, 16.39f, 9.12f, 17f, 8.36f, 17f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 15.64f)
                curveTo(7f, 14.88f, 7.61f, 14.27f, 8.36f, 14.27f)
                moveTo(15.64f, 14.27f)
                curveTo(16.39f, 14.27f, 17f, 14.88f, 17f, 15.64f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.64f, 17f)
                curveTo(14.88f, 17f, 14.27f, 16.39f, 14.27f, 15.64f)
                arcTo(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.64f, 14.27f)
                moveTo(12f, 15.64f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.36f, 17f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18.36f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.64f, 17f)
                arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15.64f)
                close()
            }
        }.build()

        return _MidiPort!!
    }

@Suppress("ObjectPropertyName")
private var _MidiPort: ImageVector? = null
