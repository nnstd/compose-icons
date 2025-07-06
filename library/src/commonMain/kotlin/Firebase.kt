package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Firebase: ImageVector
    get() {
        if (_Firebase != null) {
            return _Firebase!!
        }
        _Firebase = ImageVector.Builder(
            name = "Firebase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18.69f)
                lineTo(12.7f, 22.74f)
                curveTo(12.2f, 23f, 11.7f, 23f, 11.2f, 22.74f)
                lineTo(4f, 18.69f)
                lineTo(17.05f, 5.54f)
                lineTo(17.4f, 5.44f)
                curveTo(17.7f, 5.44f, 17.87f, 5.57f, 17.9f, 5.84f)
                lineTo(20f, 18.69f)
                moveTo(9.35f, 5.74f)
                lineTo(4.8f, 13.29f)
                lineTo(6.7f, 1.34f)
                curveTo(6.73f, 1.07f, 6.9f, 0.94f, 7.2f, 0.94f)
                curveTo(7.4f, 0.94f, 7.53f, 1f, 7.6f, 1.19f)
                lineTo(9.75f, 5.14f)
                lineTo(9.35f, 5.74f)
                moveTo(13.85f, 7f)
                lineTo(4.3f, 16.59f)
                lineTo(11.55f, 4.29f)
                curveTo(11.65f, 4.09f, 11.8f, 4f, 12f, 4f)
                curveTo(12.2f, 4f, 12.33f, 4.09f, 12.4f, 4.29f)
                lineTo(13.85f, 7f)
                close()
            }
        }.build()

        return _Firebase!!
    }

@Suppress("ObjectPropertyName")
private var _Firebase: ImageVector? = null
