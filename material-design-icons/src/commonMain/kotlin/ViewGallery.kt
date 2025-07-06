package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewGallery: ImageVector
    get() {
        if (_ViewGallery != null) {
            return _ViewGallery!!
        }
        _ViewGallery = ImageVector.Builder(
            name = "ViewGallery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(2f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                moveTo(7f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                moveTo(12f, 17f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                moveTo(17f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _ViewGallery!!
    }

@Suppress("ObjectPropertyName")
private var _ViewGallery: ImageVector? = null
