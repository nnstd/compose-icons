package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CoachLampVariant: ImageVector
    get() {
        if (_CoachLampVariant != null) {
            return _CoachLampVariant!!
        }
        _CoachLampVariant = ImageVector.Builder(
            name = "CoachLampVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 2f)
                lineTo(12f, 4f)
                lineTo(10f, 6.31f)
                lineTo(5f, 9f)
                horizontalLineTo(7f)
                lineTo(9.5f, 18f)
                lineTo(12f, 20f)
                lineTo(12.5f, 22f)
                horizontalLineTo(13.5f)
                lineTo(14f, 20f)
                lineTo(16.5f, 18f)
                lineTo(19f, 9f)
                horizontalLineTo(21f)
                lineTo(16f, 6.31f)
                lineTo(14f, 4f)
                lineTo(13.5f, 2f)
                moveTo(9f, 9f)
                horizontalLineTo(17f)
                lineTo(14.78f, 17f)
                horizontalLineTo(11.22f)
                moveTo(3f, 14f)
                verticalLineTo(22f)
                horizontalLineTo(11.5f)
                lineTo(11f, 20f)
                horizontalLineTo(8f)
                lineTo(5f, 17f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _CoachLampVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CoachLampVariant: ImageVector? = null
