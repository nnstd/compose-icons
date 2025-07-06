package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ph: ImageVector
    get() {
        if (_Ph != null) {
            return _Ph!!
        }
        _Ph = ImageVector.Builder(
            name = "Ph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                moveTo(11f, 15f)
                verticalLineTo(13f)
                curveTo(11f, 11.9f, 10.11f, 11f, 9f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                curveTo(10.11f, 17f, 11f, 16.11f, 11f, 15f)
                moveTo(9f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Ph!!
    }

@Suppress("ObjectPropertyName")
private var _Ph: ImageVector? = null
