package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileHidden: ImageVector
    get() {
        if (_FileHidden != null) {
            return _FileHidden!!
        }
        _FileHidden = ImageVector.Builder(
            name = "FileHidden",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                moveTo(18.5f, 9f)
                lineTo(16.38f, 6.88f)
                lineTo(17.63f, 5.63f)
                lineTo(20f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(18.5f)
                moveTo(13f, 3.5f)
                verticalLineTo(2f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                curveTo(4f, 2.89f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(14f)
                lineTo(16.36f, 4.36f)
                lineTo(15.11f, 5.61f)
                lineTo(13f, 3.5f)
                moveTo(20f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                moveTo(18f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                moveTo(12f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(12f)
                moveTo(8f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                moveTo(6f, 22f)
                curveTo(4.89f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                moveTo(4f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                moveTo(4f, 10f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                moveTo(18f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(4f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _FileHidden!!
    }

@Suppress("ObjectPropertyName")
private var _FileHidden: ImageVector? = null
