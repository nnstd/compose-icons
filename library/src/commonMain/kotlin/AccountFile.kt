package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountFile: ImageVector
    get() {
        if (_AccountFile != null) {
            return _AccountFile!!
        }
        _AccountFile = ImageVector.Builder(
            name = "AccountFile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 5f)
                curveTo(9.43f, 5f, 11f, 6.57f, 11f, 8.5f)
                curveTo(11f, 10.43f, 9.43f, 12f, 7.5f, 12f)
                curveTo(5.57f, 12f, 4f, 10.43f, 4f, 8.5f)
                curveTo(4f, 6.57f, 5.57f, 5f, 7.5f, 5f)
                moveTo(1f, 19f)
                verticalLineTo(16.5f)
                curveTo(1f, 14.57f, 4.46f, 13f, 7.5f, 13f)
                curveTo(8.68f, 13f, 9.92f, 13.24f, 11f, 13.64f)
                verticalLineTo(19f)
                horizontalLineTo(1f)
                moveTo(22f, 19f)
                horizontalLineTo(14f)
                curveTo(13.45f, 19f, 13f, 18.55f, 13f, 18f)
                verticalLineTo(6f)
                curveTo(13f, 5.45f, 13.45f, 5f, 14f, 5f)
                horizontalLineTo(19f)
                lineTo(23f, 9f)
                verticalLineTo(18f)
                curveTo(23f, 18.55f, 22.55f, 19f, 22f, 19f)
                moveTo(18f, 10f)
                horizontalLineTo(21f)
                verticalLineTo(9.83f)
                lineTo(18.17f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _AccountFile!!
    }

@Suppress("ObjectPropertyName")
private var _AccountFile: ImageVector? = null
