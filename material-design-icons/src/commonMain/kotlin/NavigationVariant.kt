package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NavigationVariant: ImageVector
    get() {
        if (_NavigationVariant != null) {
            return _NavigationVariant!!
        }
        _NavigationVariant = ImageVector.Builder(
            name = "NavigationVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(3f, 10.53f)
                verticalLineTo(11.5f)
                lineTo(9.84f, 14.16f)
                lineTo(12.5f, 21f)
                horizontalLineTo(13.46f)
                lineTo(21f, 3f)
                close()
            }
        }.build()

        return _NavigationVariant!!
    }

@Suppress("ObjectPropertyName")
private var _NavigationVariant: ImageVector? = null
