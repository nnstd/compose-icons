package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Oci: ImageVector
    get() {
        if (_Oci != null) {
            return _Oci!!
        }
        _Oci = ImageVector.Builder(
            name = "Oci",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                moveTo(19.12f, 19.03f)
                horizontalLineTo(4.87f)
                verticalLineTo(5f)
                horizontalLineTo(19.13f)
                verticalLineTo(19.03f)
                moveTo(14.83f, 10.71f)
                horizontalLineTo(17.69f)
                verticalLineTo(17.59f)
                horizontalLineTo(14.83f)
                moveTo(14.83f, 6.41f)
                horizontalLineTo(17.69f)
                verticalLineTo(9.27f)
                horizontalLineTo(14.83f)
                moveTo(6.3f, 6.41f)
                verticalLineTo(17.59f)
                horizontalLineTo(13.4f)
                verticalLineTo(14.72f)
                horizontalLineTo(9.17f)
                verticalLineTo(9.28f)
                horizontalLineTo(13.4f)
                verticalLineTo(6.41f)
                close()
            }
        }.build()

        return _Oci!!
    }

@Suppress("ObjectPropertyName")
private var _Oci: ImageVector? = null
