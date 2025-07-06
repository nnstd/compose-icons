package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorPolylineEdit: ImageVector
    get() {
        if (_VectorPolylineEdit != null) {
            return _VectorPolylineEdit!!
        }
        _VectorPolylineEdit = ImageVector.Builder(
            name = "VectorPolylineEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                verticalLineTo(9f)
                horizontalLineTo(4.95f)
                lineTo(6.95f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(16.41f)
                lineTo(17.41f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(9.57f)
                lineTo(10.59f, 15f)
                horizontalLineTo(9.06f)
                lineTo(7.06f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                moveTo(4f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                moveTo(18f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                moveTo(21.15f, 13f)
                curveTo(21f, 13f, 20.87f, 13.05f, 20.76f, 13.16f)
                lineTo(19.75f, 14.18f)
                lineTo(21.82f, 16.25f)
                lineTo(22.84f, 15.24f)
                curveTo(23.05f, 15.03f, 23.05f, 14.67f, 22.84f, 14.46f)
                lineTo(21.54f, 13.16f)
                curveTo(21.43f, 13.05f, 21.29f, 13f, 21.15f, 13f)
                moveTo(19.15f, 14.76f)
                lineTo(13f, 20.91f)
                verticalLineTo(23f)
                horizontalLineTo(15.09f)
                lineTo(21.23f, 16.84f)
                lineTo(19.15f, 14.76f)
                moveTo(8f, 17f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _VectorPolylineEdit!!
    }

@Suppress("ObjectPropertyName")
private var _VectorPolylineEdit: ImageVector? = null
