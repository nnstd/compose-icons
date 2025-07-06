package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bullet: ImageVector
    get() {
        if (_Bullet != null) {
            return _Bullet!!
        }
        _Bullet = ImageVector.Builder(
            name = "Bullet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 22f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                moveTo(13f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                lineTo(10f, 11.5f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(11.5f)
                lineTo(13f, 10f)
                moveTo(12f, 2f)
                curveTo(12f, 2f, 11f, 3f, 11f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                curveTo(13f, 5f, 13f, 3f, 12f, 2f)
                close()
            }
        }.build()

        return _Bullet!!
    }

@Suppress("ObjectPropertyName")
private var _Bullet: ImageVector? = null
