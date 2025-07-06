package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphabetPiqad: ImageVector
    get() {
        if (_AlphabetPiqad != null) {
            return _AlphabetPiqad!!
        }
        _AlphabetPiqad = ImageVector.Builder(
            name = "AlphabetPiqad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.04f, 4f)
                lineTo(6.54f, 17.85f)
                curveTo(6.21f, 18.55f, 5.5f, 19f, 4.73f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                curveTo(17.2f, 20f, 18.27f, 20.54f, 19f, 21.39f)
                horizontalLineTo(20f)
                curveTo(19.05f, 19.32f, 17f, 18f, 14.7f, 18f)
                horizontalLineTo(12f)
                curveTo(11.29f, 18f, 10.62f, 17.63f, 10.24f, 17.03f)
                curveTo(9.85f, 16.43f, 9.8f, 15.68f, 10.1f, 15.03f)
                lineTo(10.58f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(17.5f)
                curveTo(15.29f, 13f, 13.5f, 11.21f, 13.5f, 9f)
                curveTo(13.5f, 6.79f, 15.29f, 5f, 17.5f, 5f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _AlphabetPiqad!!
    }

@Suppress("ObjectPropertyName")
private var _AlphabetPiqad: ImageVector? = null
