package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LabelVariantOutline: ImageVector
    get() {
        if (_LabelVariantOutline != null) {
            return _LabelVariantOutline!!
        }
        _LabelVariantOutline = ImageVector.Builder(
            name = "LabelVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 17f)
                horizontalLineTo(15f)
                lineTo(18.5f, 12f)
                lineTo(15f, 7f)
                horizontalLineTo(6.5f)
                lineTo(10f, 12f)
                lineTo(6.5f, 17f)
                moveTo(15f, 19f)
                horizontalLineTo(3f)
                lineTo(7.5f, 12f)
                lineTo(3f, 5f)
                horizontalLineTo(15f)
                curveTo(15.69f, 5f, 16.23f, 5.3f, 16.64f, 5.86f)
                lineTo(21f, 12f)
                lineTo(16.64f, 18.14f)
                curveTo(16.23f, 18.7f, 15.69f, 19f, 15f, 19f)
                close()
            }
        }.build()

        return _LabelVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LabelVariantOutline: ImageVector? = null
