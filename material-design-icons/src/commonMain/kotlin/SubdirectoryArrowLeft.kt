package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SubdirectoryArrowLeft: ImageVector
    get() {
        if (_SubdirectoryArrowLeft != null) {
            return _SubdirectoryArrowLeft!!
        }
        _SubdirectoryArrowLeft = ImageVector.Builder(
            name = "SubdirectoryArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9f)
                lineTo(12.42f, 10.42f)
                lineTo(8.83f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(8.83f)
                lineTo(12.42f, 19.58f)
                lineTo(11f, 21f)
                lineTo(5f, 15f)
                lineTo(11f, 9f)
                close()
            }
        }.build()

        return _SubdirectoryArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _SubdirectoryArrowLeft: ImageVector? = null
