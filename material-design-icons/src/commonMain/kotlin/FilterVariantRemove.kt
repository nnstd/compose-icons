package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilterVariantRemove: ImageVector
    get() {
        if (_FilterVariantRemove != null) {
            return _FilterVariantRemove!!
        }
        _FilterVariantRemove = ImageVector.Builder(
            name = "FilterVariantRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                moveTo(13.81f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(13.09f)
                curveTo(13.21f, 17.28f, 13.46f, 16.61f, 13.81f, 16f)
                moveTo(18f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(21.12f, 15.46f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.46f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                lineTo(21.12f, 15.46f)
                close()
            }
        }.build()

        return _FilterVariantRemove!!
    }

@Suppress("ObjectPropertyName")
private var _FilterVariantRemove: ImageVector? = null
