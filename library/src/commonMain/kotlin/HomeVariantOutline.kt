package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeVariantOutline: ImageVector
    get() {
        if (_HomeVariantOutline != null) {
            return _HomeVariantOutline!!
        }
        _HomeVariantOutline = ImageVector.Builder(
            name = "HomeVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                lineTo(12f, 5.5f)
                lineTo(6f, 10f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                moveTo(4f, 21f)
                verticalLineTo(9f)
                lineTo(12f, 3f)
                lineTo(20f, 9f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _HomeVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeVariantOutline: ImageVector? = null
