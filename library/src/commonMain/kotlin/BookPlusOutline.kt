package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookPlusOutline: ImageVector
    get() {
        if (_BookPlusOutline != null) {
            return _BookPlusOutline!!
        }
        _BookPlusOutline = ImageVector.Builder(
            name = "BookPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.09f, 20f)
                curveTo(13.21f, 20.72f, 13.46f, 21.39f, 13.81f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(18f)
                curveTo(19.11f, 2f, 20f, 2.9f, 20f, 4f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13f, 19f, 13f)
                curveTo(18.66f, 13f, 18.33f, 13.04f, 18f, 13.09f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                lineTo(10.5f, 9.75f)
                lineTo(8f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(13.09f)
                moveTo(20f, 18f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
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
                close()
            }
        }.build()

        return _BookPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookPlusOutline: ImageVector? = null
