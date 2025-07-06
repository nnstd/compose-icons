package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UploadCircle: ImageVector
    get() {
        if (_UploadCircle != null) {
            return _UploadCircle!!
        }
        _UploadCircle = ImageVector.Builder(
            name = "UploadCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 17.5f, 17.5f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                close()
                moveTo(16f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                close()
                moveTo(16f, 10f)
                lineTo(12f, 6f)
                lineTo(8f, 10f)
                horizontalLineTo(10.5f)
                verticalLineTo(14f)
                horizontalLineTo(13.5f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _UploadCircle!!
    }

@Suppress("ObjectPropertyName")
private var _UploadCircle: ImageVector? = null
