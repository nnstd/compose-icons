package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextBoxCheckOutline: ImageVector
    get() {
        if (_TextBoxCheckOutline != null) {
            return _TextBoxCheckOutline!!
        }
        _TextBoxCheckOutline = ImageVector.Builder(
            name = "TextBoxCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 21f)
                lineTo(14.25f, 18f)
                lineTo(15.41f, 16.84f)
                lineTo(17f, 18.43f)
                lineTo(20.59f, 14.84f)
                lineTo(21.75f, 16.25f)
                moveTo(12.8f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(12.8f)
                curveTo(20.39f, 12.45f, 19.72f, 12.2f, 19f, 12.08f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(12.08f)
                curveTo(12.2f, 19.72f, 12.45f, 20.39f, 12.8f, 21f)
                moveTo(12f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                moveTo(14.68f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(12.08f)
                curveTo(16.15f, 12.22f, 15.37f, 12.54f, 14.68f, 13f)
                moveTo(17f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
            }
        }.build()

        return _TextBoxCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TextBoxCheckOutline: ImageVector? = null
