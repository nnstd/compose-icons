package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUDownLeftBold: ImageVector
    get() {
        if (_ArrowUDownLeftBold != null) {
            return _ArrowUDownLeftBold!!
        }
        _ArrowUDownLeftBold = ImageVector.Builder(
            name = "ArrowUDownLeftBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10.5f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(10.5f)
                curveTo(17f, 8.57f, 15.43f, 7f, 13.5f, 7f)
                reflectiveCurveTo(10f, 8.57f, 10f, 10.5f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                lineTo(8f, 20f)
                lineTo(2f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(10.5f)
                curveTo(6f, 6.36f, 9.36f, 3f, 13.5f, 3f)
                reflectiveCurveTo(21f, 6.36f, 21f, 10.5f)
                close()
            }
        }.build()

        return _ArrowUDownLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUDownLeftBold: ImageVector? = null
