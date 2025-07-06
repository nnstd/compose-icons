package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bird: ImageVector
    get() {
        if (_Bird != null) {
            return _Bird!!
        }
        _Bird = ImageVector.Builder(
            name = "Bird",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11.5f)
                lineTo(19.95f, 10.37f)
                curveTo(19.69f, 9.22f, 19.04f, 8.56f, 19.04f, 8.56f)
                curveTo(17.4f, 6.92f, 14.75f, 6.92f, 13.11f, 8.56f)
                lineTo(11.63f, 10.04f)
                lineTo(5f, 3f)
                curveTo(4f, 7f, 5f, 11f, 7.45f, 14.22f)
                lineTo(2f, 19.5f)
                curveTo(2f, 19.5f, 10.89f, 21.5f, 16.07f, 17.45f)
                curveTo(18.83f, 15.29f, 19.45f, 14.03f, 19.84f, 12.7f)
                lineTo(23f, 11.5f)
                moveTo(17.71f, 11.72f)
                curveTo(17.32f, 12.11f, 16.68f, 12.11f, 16.29f, 11.72f)
                curveTo(15.9f, 11.33f, 15.9f, 10.7f, 16.29f, 10.31f)
                curveTo(16.68f, 9.92f, 17.32f, 9.92f, 17.71f, 10.31f)
                curveTo(18.1f, 10.7f, 18.1f, 11.33f, 17.71f, 11.72f)
                close()
            }
        }.build()

        return _Bird!!
    }

@Suppress("ObjectPropertyName")
private var _Bird: ImageVector? = null
