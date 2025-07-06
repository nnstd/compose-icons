package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilterVariantPlus: ImageVector
    get() {
        if (_FilterVariantPlus != null) {
            return _FilterVariantPlus!!
        }
        _FilterVariantPlus = ImageVector.Builder(
            name = "FilterVariantPlus",
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
                moveTo(18f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _FilterVariantPlus!!
    }

@Suppress("ObjectPropertyName")
private var _FilterVariantPlus: ImageVector? = null
