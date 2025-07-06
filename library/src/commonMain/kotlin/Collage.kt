package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Collage: ImageVector
    get() {
        if (_Collage != null) {
            return _Collage!!
        }
        _Collage = ImageVector.Builder(
            name = "Collage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                moveTo(13f, 3f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.11f, 3f, 19f, 3f)
                moveTo(13f, 13f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(13f)
            }
        }.build()

        return _Collage!!
    }

@Suppress("ObjectPropertyName")
private var _Collage: ImageVector? = null
