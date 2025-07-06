package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailArrowLeftOutline: ImageVector
    get() {
        if (_EmailArrowLeftOutline != null) {
            return _EmailArrowLeftOutline!!
        }
        _EmailArrowLeftOutline = ImageVector.Builder(
            name = "EmailArrowLeftOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                curveTo(13f, 18.66f, 13.04f, 18.33f, 13.09f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                lineTo(12f, 13f)
                lineTo(20f, 8f)
                verticalLineTo(13.09f)
                curveTo(20.72f, 13.21f, 21.39f, 13.46f, 22f, 13.81f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13f, 19.34f, 13f, 19f)
                moveTo(20f, 6f)
                lineTo(12f, 11f)
                lineTo(4f, 6f)
                horizontalLineTo(20f)
                moveTo(18f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                lineTo(15f, 19f)
                lineTo(18f, 16f)
                close()
            }
        }.build()

        return _EmailArrowLeftOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailArrowLeftOutline: ImageVector? = null
