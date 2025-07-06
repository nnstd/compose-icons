package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagOutline: ImageVector
    get() {
        if (_FlagOutline != null) {
            return _FlagOutline!!
        }
        _FlagOutline = ImageVector.Builder(
            name = "FlagOutline",
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
            }
        }.build()

        return _FlagOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlagOutline: ImageVector? = null
