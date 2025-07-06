package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagMinusOutline: ImageVector
    get() {
        if (_FlagMinusOutline != null) {
            return _FlagMinusOutline!!
        }
        _FlagMinusOutline = ImageVector.Builder(
            name = "FlagMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.36f, 6f)
                lineTo(12.76f, 8f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(14.64f)
                lineTo(14.24f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(12.36f)
                moveTo(14f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(12.6f)
                lineTo(13f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(14.4f)
                moveTo(23f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _FlagMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlagMinusOutline: ImageVector? = null
