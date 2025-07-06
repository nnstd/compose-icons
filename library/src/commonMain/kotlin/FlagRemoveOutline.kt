package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagRemoveOutline: ImageVector
    get() {
        if (_FlagRemoveOutline != null) {
            return _FlagRemoveOutline!!
        }
        _FlagRemoveOutline = ImageVector.Builder(
            name = "FlagRemoveOutline",
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

        return _FlagRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlagRemoveOutline: ImageVector? = null
