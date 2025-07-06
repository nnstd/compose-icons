package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AngleObtuse: ImageVector
    get() {
        if (_AngleObtuse != null) {
            return _AngleObtuse!!
        }
        _AngleObtuse = ImageVector.Builder(
            name = "AngleObtuse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 19f)
                horizontalLineTo(9.31f)
                lineTo(4.07f, 5.36f)
                lineTo(5.93f, 4.64f)
                lineTo(8.96f, 12.5f)
                curveTo(9.5f, 12.29f, 10.09f, 12.17f, 10.71f, 12.17f)
                verticalLineTo(12.17f)
                curveTo(13.38f, 12.17f, 15.56f, 14.34f, 15.58f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                moveTo(10.69f, 17f)
                horizontalLineTo(13.58f)
                curveTo(13.56f, 15.42f, 12.3f, 14.17f, 10.71f, 14.17f)
                curveTo(10.34f, 14.17f, 10f, 14.24f, 9.67f, 14.36f)
                lineTo(10.69f, 17f)
                close()
            }
        }.build()

        return _AngleObtuse!!
    }

@Suppress("ObjectPropertyName")
private var _AngleObtuse: ImageVector? = null
