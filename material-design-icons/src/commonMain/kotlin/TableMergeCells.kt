package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableMergeCells: ImageVector
    get() {
        if (_TableMergeCells != null) {
            return _TableMergeCells!!
        }
        _TableMergeCells = ImageVector.Builder(
            name = "TableMergeCells",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                moveTo(19f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                moveTo(5f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                moveTo(21f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                moveTo(8f, 13f)
                verticalLineTo(15f)
                lineTo(11f, 12f)
                lineTo(8f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                moveTo(16f, 11f)
                verticalLineTo(9f)
                lineTo(13f, 12f)
                lineTo(16f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _TableMergeCells!!
    }

@Suppress("ObjectPropertyName")
private var _TableMergeCells: ImageVector? = null
