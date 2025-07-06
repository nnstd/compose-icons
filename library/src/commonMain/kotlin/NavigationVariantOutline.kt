package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NavigationVariantOutline: ImageVector
    get() {
        if (_NavigationVariantOutline != null) {
            return _NavigationVariantOutline!!
        }
        _NavigationVariantOutline = ImageVector.Builder(
            name = "NavigationVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.27f, 6.73f)
                lineTo(13.03f, 16.86f)
                lineTo(11.71f, 13.44f)
                lineTo(11.39f, 12.61f)
                lineTo(10.57f, 12.29f)
                lineTo(7.14f, 10.96f)
                lineTo(17.27f, 6.73f)
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

        return _NavigationVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NavigationVariantOutline: ImageVector? = null
