package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeOutline: ImageVector
    get() {
        if (_HomeOutline != null) {
            return _HomeOutline!!
        }
        _HomeOutline = ImageVector.Builder(
            name = "HomeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.69f)
                lineTo(17f, 10.19f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(10.19f)
                lineTo(12f, 5.69f)
                moveTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
            }
        }.build()

        return _HomeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeOutline: ImageVector? = null
