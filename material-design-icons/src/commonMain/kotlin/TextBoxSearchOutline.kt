package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextBoxSearchOutline: ImageVector
    get() {
        if (_TextBoxSearchOutline != null) {
            return _TextBoxSearchOutline!!
        }
        _TextBoxSearchOutline = ImageVector.Builder(
            name = "TextBoxSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 12f)
                curveTo(18f, 12f, 20f, 14f, 20f, 16.5f)
                curveTo(20f, 17.38f, 19.75f, 18.21f, 19.31f, 18.9f)
                lineTo(22.39f, 22f)
                lineTo(21f, 23.39f)
                lineTo(17.88f, 20.32f)
                curveTo(17.19f, 20.75f, 16.37f, 21f, 15.5f, 21f)
                curveTo(13f, 21f, 11f, 19f, 11f, 16.5f)
                curveTo(11f, 14f, 13f, 12f, 15.5f, 12f)
                moveTo(15.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 14f)
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(13.03f)
                curveTo(20.5f, 12.23f, 19.81f, 11.54f, 19f, 11f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(9.5f)
                curveTo(9.81f, 19.75f, 10.26f, 20.42f, 10.81f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(7f, 11f)
                horizontalLineTo(12.03f)
                curveTo(11.23f, 11.5f, 10.54f, 12.19f, 10f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(7f, 15f)
                horizontalLineTo(9.17f)
                curveTo(9.06f, 15.5f, 9f, 16f, 9f, 16.5f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _TextBoxSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TextBoxSearchOutline: ImageVector? = null
