package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChairSchool: ImageVector
    get() {
        if (_ChairSchool != null) {
            return _ChairSchool!!
        }
        _ChairSchool = ImageVector.Builder(
            name = "ChairSchool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                lineTo(13.53f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(14.46f)
                lineTo(18.17f, 22f)
                horizontalLineTo(15.97f)
                lineTo(15.04f, 20f)
                horizontalLineTo(6.38f)
                lineTo(5.35f, 22f)
                horizontalLineTo(3.1f)
                lineTo(7.23f, 14f)
                horizontalLineTo(7f)
                curveTo(6.55f, 14f, 6.17f, 13.7f, 6.04f, 13.3f)
                lineTo(2.87f, 3.84f)
                lineTo(3.82f, 3.5f)
                curveTo(4.34f, 3.34f, 4.91f, 3.63f, 5.08f, 4.15f)
                lineTo(7.72f, 12f)
                horizontalLineTo(12.1f)
                lineTo(15.57f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                moveTo(9.5f, 14f)
                lineTo(7.42f, 18f)
                horizontalLineTo(14.11f)
                lineTo(12.26f, 14f)
                horizontalLineTo(9.5f)
                close()
            }
        }.build()

        return _ChairSchool!!
    }

@Suppress("ObjectPropertyName")
private var _ChairSchool: ImageVector? = null
