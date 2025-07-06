package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorEllipse: ImageVector
    get() {
        if (_VectorEllipse != null) {
            return _VectorEllipse!!
        }
        _VectorEllipse = ImageVector.Builder(
            name = "VectorEllipse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(20.35f)
                curveTo(19.38f, 17.12f, 17.43f, 18.78f, 15f, 19.54f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(19.54f)
                curveTo(5.5f, 18.45f, 3f, 15.5f, 3f, 12f)
                curveTo(3f, 7.58f, 7.03f, 4f, 12f, 4f)
                curveTo(15.78f, 4f, 19f, 6.07f, 20.35f, 9f)
                horizontalLineTo(23f)
                moveTo(17f, 15f)
                verticalLineTo(9f)
                horizontalLineTo(18.06f)
                curveTo(16.85f, 7.21f, 14.59f, 6f, 12f, 6f)
                curveTo(8.13f, 6f, 5f, 8.69f, 5f, 12f)
                curveTo(5f, 14.39f, 6.64f, 16.46f, 9f, 17.42f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(17.42f)
                curveTo(16.29f, 16.9f, 17.35f, 16.05f, 18.06f, 15f)
                horizontalLineTo(17f)
                moveTo(19f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(11f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _VectorEllipse!!
    }

@Suppress("ObjectPropertyName")
private var _VectorEllipse: ImageVector? = null
