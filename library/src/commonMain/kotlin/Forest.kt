package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Forest: ImageVector
    get() {
        if (_Forest != null) {
            return _Forest!!
        }
        _Forest = ImageVector.Builder(
            name = "Forest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 12f)
                lineTo(9f, 2f)
                lineTo(2f, 12f)
                horizontalLineTo(3.86f)
                lineTo(0f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                lineTo(14.14f, 12f)
                horizontalLineTo(16f)
                moveTo(20.14f, 12f)
                horizontalLineTo(22f)
                lineTo(15f, 2f)
                lineTo(12.61f, 5.41f)
                lineTo(17.92f, 13f)
                horizontalLineTo(15.97f)
                lineTo(19.19f, 18f)
                horizontalLineTo(24f)
                lineTo(20.14f, 12f)
                moveTo(13f, 19f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _Forest!!
    }

@Suppress("ObjectPropertyName")
private var _Forest: ImageVector? = null
