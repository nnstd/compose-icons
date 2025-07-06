package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SubdirectoryArrowRight: ImageVector
    get() {
        if (_SubdirectoryArrowRight != null) {
            return _SubdirectoryArrowRight!!
        }
        _SubdirectoryArrowRight = ImageVector.Builder(
            name = "SubdirectoryArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15f)
                lineTo(13f, 21f)
                lineTo(11.58f, 19.58f)
                lineTo(15.17f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(15.17f)
                lineTo(11.58f, 10.42f)
                lineTo(13f, 9f)
                lineTo(19f, 15f)
                close()
            }
        }.build()

        return _SubdirectoryArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _SubdirectoryArrowRight: ImageVector? = null
