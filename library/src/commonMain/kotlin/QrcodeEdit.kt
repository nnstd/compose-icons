package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.QrcodeEdit: ImageVector
    get() {
        if (_QrcodeEdit != null) {
            return _QrcodeEdit!!
        }
        _QrcodeEdit = ImageVector.Builder(
            name = "QrcodeEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                moveTo(1f, 1f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(1f)
                moveTo(3f, 3f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                moveTo(5f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                moveTo(1f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(23f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                moveTo(3f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                moveTo(13f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(23f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                moveTo(21f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                moveTo(19f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                moveTo(22.7f, 3.35f)
                lineTo(21.7f, 4.35f)
                lineTo(19.65f, 2.35f)
                lineTo(20.65f, 1.35f)
                curveTo(20.85f, 1.14f, 21.19f, 1.13f, 21.42f, 1.35f)
                lineTo(22.7f, 2.58f)
                curveTo(22.91f, 2.78f, 22.92f, 3.12f, 22.7f, 3.35f)
                moveTo(13f, 8.94f)
                lineTo(19.07f, 2.88f)
                lineTo(21.12f, 4.93f)
                lineTo(15.06f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(8.94f)
                close()
            }
        }.build()

        return _QrcodeEdit!!
    }

@Suppress("ObjectPropertyName")
private var _QrcodeEdit: ImageVector? = null
