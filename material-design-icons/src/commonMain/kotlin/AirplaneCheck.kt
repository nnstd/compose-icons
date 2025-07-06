package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirplaneCheck: ImageVector
    get() {
        if (_AirplaneCheck != null) {
            return _AirplaneCheck!!
        }
        _AirplaneCheck = ImageVector.Builder(
            name = "AirplaneCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.97f, 13.83f)
                curveTo(15.08f, 14.35f, 14.34f, 15.09f, 13.82f, 16f)
                lineTo(11.55f, 11.63f)
                lineTo(7.66f, 15.5f)
                lineTo(8f, 18f)
                lineTo(6.95f, 19.06f)
                lineTo(5.18f, 15.87f)
                lineTo(2f, 14.11f)
                lineTo(3.06f, 13.05f)
                lineTo(5.54f, 13.4f)
                lineTo(9.43f, 9.5f)
                lineTo(2f, 5.62f)
                lineTo(3.41f, 4.21f)
                lineTo(12.61f, 6.33f)
                lineTo(16.5f, 2.44f)
                curveTo(17.08f, 1.85f, 18.03f, 1.85f, 18.62f, 2.44f)
                curveTo(19.2f, 3.03f, 19.2f, 4f, 18.62f, 4.56f)
                lineTo(14.73f, 8.45f)
                lineTo(15.97f, 13.83f)
                moveTo(21.34f, 15.84f)
                lineTo(17.75f, 19.43f)
                lineTo(16.16f, 17.84f)
                lineTo(15f, 19f)
                lineTo(17.75f, 22f)
                lineTo(22.5f, 17.25f)
                lineTo(21.34f, 15.84f)
                close()
            }
        }.build()

        return _AirplaneCheck!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneCheck: ImageVector? = null
