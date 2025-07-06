package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagPlusOutline: ImageVector
    get() {
        if (_FlagPlusOutline != null) {
            return _FlagPlusOutline!!
        }
        _FlagPlusOutline = ImageVector.Builder(
            name = "FlagPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 16f)
                lineTo(12.6f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                lineTo(14.4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13f, 19f, 13f)
                curveTo(18.66f, 13f, 18.33f, 13.04f, 18f, 13.09f)
                verticalLineTo(8f)
                horizontalLineTo(12.76f)
                lineTo(12.36f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(14.24f)
                lineTo(14.64f, 14f)
                horizontalLineTo(15.69f)
                curveTo(14.92f, 14.5f, 14.27f, 15.2f, 13.81f, 16f)
                horizontalLineTo(13f)
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

        return _FlagPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlagPlusOutline: ImageVector? = null
