package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rewind45: ImageVector
    get() {
        if (_Rewind45 != null) {
            return _Rewind45!!
        }
        _Rewind45 = ImageVector.Builder(
            name = "Rewind45",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 3f)
                curveTo(17.1f, 3f, 21.1f, 6f, 22.5f, 10.2f)
                lineTo(20.1f, 11f)
                curveTo(19f, 7.8f, 16f, 5.5f, 12.5f, 5.5f)
                curveTo(10.5f, 5.5f, 8.8f, 6.2f, 7.4f, 7.4f)
                lineTo(10f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                lineTo(5.6f, 5.6f)
                curveTo(7.4f, 4f, 9.9f, 3f, 12.5f, 3f)
                moveTo(13f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                curveTo(18.1f, 16f, 19f, 16.9f, 19f, 18f)
                verticalLineTo(20f)
                curveTo(19f, 21.1f, 18.1f, 22f, 17f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                moveTo(5f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _Rewind45!!
    }

@Suppress("ObjectPropertyName")
private var _Rewind45: ImageVector? = null
