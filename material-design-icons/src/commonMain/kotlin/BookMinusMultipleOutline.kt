package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookMinusMultipleOutline: ImageVector
    get() {
        if (_BookMinusMultipleOutline != null) {
            return _BookMinusMultipleOutline!!
        }
        _BookMinusMultipleOutline = ImageVector.Builder(
            name = "BookMinusMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.09f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                curveTo(3f, 21.11f, 3.9f, 22f, 5f, 22f)
                horizontalLineTo(13.81f)
                curveTo(13.44f, 21.39f, 13.2f, 20.71f, 13.09f, 20f)
                moveTo(19f, 2f)
                horizontalLineTo(9f)
                curveTo(7.9f, 2f, 7f, 2.9f, 7f, 4f)
                verticalLineTo(16f)
                curveTo(7f, 17.11f, 7.9f, 18f, 9f, 18f)
                horizontalLineTo(13.09f)
                curveTo(13.2f, 17.29f, 13.44f, 16.61f, 13.81f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                lineTo(13.5f, 7.75f)
                lineTo(16f, 10f)
                verticalLineTo(4f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                curveTo(19.68f, 13f, 20.36f, 13.11f, 21f, 13.34f)
                verticalLineTo(4f)
                curveTo(21f, 2.9f, 20.11f, 2f, 19f, 2f)
                moveTo(23f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _BookMinusMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookMinusMultipleOutline: ImageVector? = null
