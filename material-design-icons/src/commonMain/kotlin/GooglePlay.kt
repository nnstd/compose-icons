package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GooglePlay: ImageVector
    get() {
        if (_GooglePlay != null) {
            return _GooglePlay!!
        }
        _GooglePlay = ImageVector.Builder(
            name = "GooglePlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 20.5f)
                verticalLineTo(3.5f)
                curveTo(3f, 2.91f, 3.34f, 2.39f, 3.84f, 2.15f)
                lineTo(13.69f, 12f)
                lineTo(3.84f, 21.85f)
                curveTo(3.34f, 21.6f, 3f, 21.09f, 3f, 20.5f)
                moveTo(16.81f, 15.12f)
                lineTo(6.05f, 21.34f)
                lineTo(14.54f, 12.85f)
                lineTo(16.81f, 15.12f)
                moveTo(20.16f, 10.81f)
                curveTo(20.5f, 11.08f, 20.75f, 11.5f, 20.75f, 12f)
                curveTo(20.75f, 12.5f, 20.53f, 12.9f, 20.18f, 13.18f)
                lineTo(17.89f, 14.5f)
                lineTo(15.39f, 12f)
                lineTo(17.89f, 9.5f)
                lineTo(20.16f, 10.81f)
                moveTo(6.05f, 2.66f)
                lineTo(16.81f, 8.88f)
                lineTo(14.54f, 11.15f)
                lineTo(6.05f, 2.66f)
                close()
            }
        }.build()

        return _GooglePlay!!
    }

@Suppress("ObjectPropertyName")
private var _GooglePlay: ImageVector? = null
