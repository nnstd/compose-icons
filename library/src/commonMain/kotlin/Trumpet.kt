package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Trumpet: ImageVector
    get() {
        if (_Trumpet != null) {
            return _Trumpet!!
        }
        _Trumpet = ImageVector.Builder(
            name = "Trumpet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6f)
                curveTo(21f, 11f, 15f, 11f, 15f, 11f)
                horizontalLineTo(4f)
                curveTo(3f, 11f, 2f, 10f, 2f, 10f)
                horizontalLineTo(1f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                curveTo(2f, 14f, 3f, 13f, 4f, 13f)
                horizontalLineTo(4.3f)
                curveTo(4.1f, 13.3f, 4f, 13.6f, 4f, 14f)
                verticalLineTo(16f)
                curveTo(4f, 17.1f, 4.9f, 18f, 6f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                curveTo(17.1f, 18f, 18f, 17.1f, 18f, 16f)
                verticalLineTo(14f)
                curveTo(18f, 13.9f, 18f, 13.7f, 17.9f, 13.6f)
                curveTo(19.6f, 14.2f, 21.4f, 15.4f, 22f, 18f)
                horizontalLineTo(23f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                moveTo(6f, 16.5f)
                curveTo(5.7f, 16.5f, 5.5f, 16.3f, 5.5f, 16f)
                verticalLineTo(14f)
                curveTo(5.5f, 13.7f, 5.7f, 13.5f, 6f, 13.5f)
                horizontalLineTo(7f)
                verticalLineTo(16.5f)
                horizontalLineTo(6f)
                moveTo(9f, 16.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(10f)
                verticalLineTo(16.5f)
                horizontalLineTo(9f)
                moveTo(12f, 16.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(13f)
                verticalLineTo(16.5f)
                horizontalLineTo(12f)
                moveTo(16.5f, 16f)
                curveTo(16.5f, 16.3f, 16.3f, 16.5f, 16f, 16.5f)
                horizontalLineTo(15f)
                verticalLineTo(13.5f)
                horizontalLineTo(16f)
                curveTo(16.3f, 13.5f, 16.5f, 13.7f, 16.5f, 14f)
                verticalLineTo(16f)
                moveTo(9f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                moveTo(12f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                moveTo(15f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _Trumpet!!
    }

@Suppress("ObjectPropertyName")
private var _Trumpet: ImageVector? = null
