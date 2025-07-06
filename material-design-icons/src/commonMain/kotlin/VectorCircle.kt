package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorCircle: ImageVector
    get() {
        if (_VectorCircle != null) {
            return _VectorCircle!!
        }
        _VectorCircle = ImageVector.Builder(
            name = "VectorCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                verticalLineTo(4.06f)
                curveTo(6.72f, 4.92f, 4.92f, 6.72f, 4.05f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(4.06f)
                curveTo(4.92f, 17.28f, 6.72f, 19.09f, 9f, 19.95f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(19.94f)
                curveTo(17.28f, 19.08f, 19.09f, 17.28f, 19.95f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(19.94f)
                curveTo(19.08f, 6.72f, 17.28f, 4.92f, 15f, 4.05f)
                verticalLineTo(2f)
                moveTo(11f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                moveTo(9f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(6.25f)
                curveTo(16.18f, 6.86f, 17.14f, 7.82f, 17.75f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(17.75f)
                curveTo(17.14f, 16.18f, 16.18f, 17.14f, 15f, 17.75f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(17.75f)
                curveTo(7.82f, 17.14f, 6.86f, 16.18f, 6.25f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(6.25f)
                curveTo(6.86f, 7.82f, 7.82f, 6.86f, 9f, 6.25f)
                moveTo(4f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                moveTo(18f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                moveTo(11f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
            }
        }.build()

        return _VectorCircle!!
    }

@Suppress("ObjectPropertyName")
private var _VectorCircle: ImageVector? = null
