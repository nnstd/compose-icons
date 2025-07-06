package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PineTreeVariantOutline: ImageVector
    get() {
        if (_PineTreeVariantOutline != null) {
            return _PineTreeVariantOutline!!
        }
        _PineTreeVariantOutline = ImageVector.Builder(
            name = "PineTreeVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 12f)
                lineTo(12f, 2f)
                lineTo(5f, 12f)
                horizontalLineTo(6.86f)
                lineTo(3f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                lineTo(17.14f, 12f)
                horizontalLineTo(19f)
                moveTo(15.16f, 10f)
                horizontalLineTo(13.5f)
                lineTo(17.34f, 16f)
                horizontalLineTo(6.67f)
                lineTo(10.53f, 10f)
                horizontalLineTo(8.84f)
                lineTo(12f, 5.5f)
                lineTo(15.16f, 10f)
                close()
            }
        }.build()

        return _PineTreeVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PineTreeVariantOutline: ImageVector? = null
